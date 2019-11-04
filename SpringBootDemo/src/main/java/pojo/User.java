/**

*@description TODO
*@author Panda

 */
package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月4日
 */
@XmlRootElement
public class User {
    String userName;
    String userAge;
    String userAddress;
    
    public User(String userName, String userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

	/**
	 * @return the userName
	 */
    @XmlElement
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
    @XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userAge
	 */
    @XmlElement
	public String getUserAge() {
		return userAge;
	}

	/**
	 * @param userAge the userAge to set
	 */
    @XmlElement
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	/**
	 * @return the userAddress
	 */
    @XmlElement
	public String getUserAddress() {
		return userAddress;
	}

	/**
	 * @param userAddress the userAddress to set
	 */
    @XmlElement
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

    
}
