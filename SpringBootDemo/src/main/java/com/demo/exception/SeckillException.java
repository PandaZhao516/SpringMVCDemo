/**

*@description TODO
*@author Panda

 */
package com.demo.exception;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月21日
 */
public class SeckillException extends RuntimeException{
	
	public SeckillException (String message){
		super(message);
	}
	
	public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
