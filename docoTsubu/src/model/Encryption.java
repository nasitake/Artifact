package model;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Encryption {

//パスワードの暗号化を行うメソッド
public String seacret(String password) {
	String source = password;

	Charset charset = StandardCharsets.UTF_8;

	String algorithm = "MD5";

	byte[] bytes = null;
	try {
		bytes = MessageDigest.getInstance(algorithm).digest(source.getBytes(charset));
	}catch(NoSuchAlgorithmException e){
		e.printStackTrace();
	}

	String result = DatatypeConverter.printHexBinary(bytes);

	return result;
}

}
