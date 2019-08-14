package com.demo;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Table;
import lombok.Data;

import java.util.Date;

@Table(name = "areas")
@Data
public class Areas extends Model {
    Integer areas;
    Date created_at;
    Date updated_at;
    Date deleted_at;
    Integer parent_id;
    String parent_ids;
    String code;
    String name;
    String type;
}
