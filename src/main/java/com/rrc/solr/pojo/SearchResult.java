package com.rrc.solr.pojo;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class SearchResult implements Serializable {

    /**
     * 总页数
     */
    private long totalPages;

    /**
     * 总记录数
     */
    private long recordCount;

    /**
     * 搜索返回的内容
     */
    private List<SearchItem> itemList;

}
