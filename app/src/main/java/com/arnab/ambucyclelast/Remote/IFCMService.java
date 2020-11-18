package com.arnab.ambucyclelast.Remote;

import com.arnab.ambucyclelast.Model.FCMResponse;
import com.arnab.ambucyclelast.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAuzeTwQQ:APA91bEdfmFBC0u_FMfJzgX6YlJuScg6D2tCyydrj66Bz1yEgQN_rp1QnR6tM_Rg8bCGaTGYESzK7NhIGIeXMHdNRRGHtl2ArvU8VcNSn7t5cmuHbwl_qwtQmj-hfiRkED1T8OmFBk9c"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}