/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dfjinxin.commons.auth.utlis;


import com.dfjinxin.commons.core.constant.SecurityConstants;
import com.dfjinxin.commons.core.exception.ServiceException;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 安全工具类
 */
@Slf4j
@UtilityClass
public class SecurityUtils {

	private final String PRINCIPAL = "principal";
	private static final String N_A = "N/A";

	/**
	 * 获取Authentication
	 */
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

	/**
	 * 获取用户
	 */
	public OnlineUser getUser(Authentication onlineAuthentication) {
		Object principal = onlineAuthentication.getPrincipal();
		if (principal instanceof OnlineUser) {
			return (OnlineUser) principal;
		}
		throw new ServiceException("401", "用户未登录");
	}

	/**
	 * 获取用户
	 */
	public OnlineUser getUser() {
		OnlineUser onlineUser = null;

		try {
			LinkedHashMap<String, LinkedHashMap<String, Object>> principal =
					(LinkedHashMap<String, LinkedHashMap<String, Object>>) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if(null != principal){
				if(principal.containsKey(PRINCIPAL)){
					LinkedHashMap<String, Object> map = principal.get(PRINCIPAL);
					Collection<? extends GrantedAuthority> authorities = getAuthorities(map);

					String username = String.valueOf(map.get(SecurityConstants.DETAILS_USERNAME));
					Long userId = (Long)map.get(SecurityConstants.DETAILS_USER_ID);
					Long tenantId = (Long)map.get(SecurityConstants.TENANT_ID);
					onlineUser = new OnlineUser(userId, tenantId, username, N_A, true, true, true, true, authorities);
				}
			}
		} catch (Exception e) {
			log.error("获取登录用户信息异常, 异常信息：{}", e);
		}

		if(null == onlineUser){
			throw new ServiceException("401", "用户未登录");
		}
		return onlineUser;
	}

	private Collection<? extends GrantedAuthority> getAuthorities(Map<String, ?> map) {
		Object authorities = map.get("authorities");
		if (authorities instanceof String) {
			return AuthorityUtils.commaSeparatedStringToAuthorityList((String) authorities);
		}
		if (authorities instanceof Collection) {
			return AuthorityUtils.commaSeparatedStringToAuthorityList(StringUtils
					.collectionToCommaDelimitedString((Collection<?>) authorities));
		}
		throw new IllegalArgumentException("Authorities must be either a String or a Collection");
	}
}
