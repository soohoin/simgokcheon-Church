package com.church.simgokchyun.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class BoardReplyLike {
    
    private @NonNull String board_div_cd;
    private @NonNull String click_div_cd;
    private @NonNull String board_no;
    private @NonNull String reply_no;
    private @NonNull String click_user_id;
    private String del_yn;
    private String chg_user_id;
    private String chg_dt;
    private String reg_user_id;
    private String reg_dt;
}
