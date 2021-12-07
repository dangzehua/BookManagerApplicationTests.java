package com.example.bookmanager.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * TbScore
 *
 * @author dml
 * @date 2021/12/05 17:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "tb_stu_score")
public class TbScore {

    @TableId(type = IdType.AUTO)
    Integer id;

    String score;

    Integer stuId;

    Integer subjectId;


}
