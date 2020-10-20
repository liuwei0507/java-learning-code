package com.shardingsphere.entity;

import lombok.Data;

@Data
public class HealthRecord {

	private Long recordId;
	private Long userId;
	private Long levelId;
	private String remark;
}
