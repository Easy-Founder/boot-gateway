package com.boot.gateway.filter;

/**
 * @Author chencl
 * @Date 2020/8/10 10:15
 * @Version 1.0
 * @Description
 */
public class UrlFilter {
    private static  final String nointerceterurl="/api/user/login,/api/user/add";
    /**
     * 用来判断 如果 当前的请求 在 放行的请求中存在,(不需要拦截 :true,否则需要拦截:false)
     * @return
     */
    public static boolean hasAuth(String uri){
        String[] split = nointerceterurl.split(",");
        for (String s : split) {
            if(s.equals(uri)){
                //不需要拦截
                return true;
            }
        }
        //要拦截
        return false;
    }
}
