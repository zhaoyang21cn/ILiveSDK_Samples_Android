package com.tencent.qcloud.suixinbo.presenters.viewinface;

import com.tencent.qcloud.suixinbo.model.RoomInfoJson;

import java.util.ArrayList;


/**
 *  列表页面回调
 */
public interface LiveListView extends MvpView{


    void showRoomList(ArrayList<RoomInfoJson> roomlist);
}
