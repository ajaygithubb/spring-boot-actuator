package com.javatechie.spring.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
@Component
@Endpoint(id = "javatechie", enableByDefault = true)
public class MyEndPoint {
	@ReadOperation
	public MyEndPointResponse features() {
		return new MyEndPointResponse(263872, "Java-Techie", "Active ");
	}

}

class MyEndPointResponse {
	private int id;
	private String name;
	private String status;

	@Override
	public String toString() {
		return "MyEndPointResponse [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

	public MyEndPointResponse() {
		super();
	}

	public MyEndPointResponse(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
