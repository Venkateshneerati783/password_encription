package com.venkatesh;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Pwdutils {

	
		
		public String encodepwd(String pwd) {
			Encoder encoder = Base64.getEncoder();
			byte[] en = encoder.encode(pwd.getBytes());
			String password=new String(en);
			return password;
		}

	}

