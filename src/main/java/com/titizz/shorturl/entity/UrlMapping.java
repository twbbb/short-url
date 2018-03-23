package com.titizz.shorturl.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class UrlMapping implements Serializable {
	
	private Long code;
	
	private String url;
	
	private Timestamp createdate;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Timestamp getCreatedate()
	{
		return createdate;
	}

	public void setCreatedate(Timestamp createdate)
	{
		this.createdate = createdate;
	}
	
	
}
