package jat.vijesh;

import java.util.List;

import jat.vijesh.model.Menu;
import jat.vijesh.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();


    @GET("menu.json")
    Call<List<Menu>> getMenuList();

}
