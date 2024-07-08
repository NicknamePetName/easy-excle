package com.example.yixin.dataobject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drawing implements Serializable {

    private int id;
    private String drawingCode;
    private String version;
    private int thickness;
    private int width;
    private int length;
    private String filename;
    private String storePath;
    private String modelType;
    private String description;
    private int deleted;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int createUser;
    private int updateUser;
}
