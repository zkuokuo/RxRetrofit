package ximmerse.com.rxretrofit;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者:zkk
 * 邮箱:15671555534@163.com
 * 描述:
 */

public interface IPInterface {
    // http://ip.taobao.com/service/getIpInfo.php?ip=202.178.10.23
    @GET("/service/getIpInfo.php")
    public Observable<IPBean> getLocation(@Query("ip")String ip);
}
