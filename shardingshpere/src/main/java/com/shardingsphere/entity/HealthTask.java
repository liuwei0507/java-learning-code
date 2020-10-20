package com.shardingsphere.entity;

import lombok.Data;

@Data
public class HealthTask {

	private Long taskId;
	private Long userId;
	private Long recordId;
	private String taskName;
}
