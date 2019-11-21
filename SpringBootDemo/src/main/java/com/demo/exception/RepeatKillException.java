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
public class RepeatKillException extends SeckillException{

	/**
	 * @param message
	 */
	public RepeatKillException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
