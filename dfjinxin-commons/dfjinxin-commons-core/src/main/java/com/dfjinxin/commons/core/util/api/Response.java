/**
 * 2019 东方金信
 */

package com.dfjinxin.commons.core.util.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class Response extends HashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final int SC_INTERNAL_SERVER_ERROR = 500;
	
	public Response() {
		put("code", 0);
		put("msg", "success");
	}
	
	public static Response error() {
		return error(SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static Response error(String msg) {
		return error(SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static Response error(int code, String msg) {
		Response response = new Response();
		response.put("code", code);
		response.put("msg", msg);
		return response;
	}

	public static Response ok(String msg) {
		Response response = new Response();
		response.put("msg", msg);
		return response;
	}
	
	public static Response ok(Map<String, Object> map) {
		Response response = new Response();
		response.putAll(map);
		return response;
	}
	
	public static Response ok() {
		return new Response();
	}

	public Response put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
