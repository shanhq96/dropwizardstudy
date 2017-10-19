package cn.rknight.core;

import javax.ws.rs.QueryParam;

public abstract class PageRequest {
    @QueryParam("page")
    int page;
    @QueryParam("size")
    int size;
}
