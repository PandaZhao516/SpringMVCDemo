/**

*@description TODO
*@author Panda

 */
package com;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年10月24日
 */
@Component
@ConfigurationProperties(prefix = "author")
public class Author {
	private  String name;

    private  String GithubUrl;
    
    public String getGithubUrl() {
        return GithubUrl;
    }

    public void setGithubUrl(String csdnUrl) {
        this.GithubUrl = csdnUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
