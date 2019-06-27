package cn.cdtu.CDTUE.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.UUID;
import org.apache.commons.codec.digest.DigestUtils;


public class Tools {

	public static String md5(String pass) {
		return DigestUtils.md5Hex(pass);
	}
	
	
	public static String getTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	public static String getId() {
		UUID uuid = UUID.randomUUID();
		
		String id = uuid.toString();
		
		int num = id.hashCode();
		
		num = num > 0 ? num : -num;
		
		id = String.valueOf(num);
		
		return id;
	}
	
	public static void main(String[] args) {
		// 娉娉袅袅十三余，豆蔻梢头二月初
		System.out.println(Tools.md5("ppnn13%dkstfeb1st"));
	}
	
	
	
	
}
