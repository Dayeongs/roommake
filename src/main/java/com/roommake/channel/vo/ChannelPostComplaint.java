package com.roommake.channel.vo;

import com.roommake.community.vo.ComplaintCategory;
import com.roommake.user.vo.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ChannelPostComplaint {

    private int id;                         // 신고번호
    private Channelpost postId;             // 채널글번호
    private User userId;                    // 신고한 유저번호
    private ComplaintCategory categoryId;   // 신고 카테고리번호
    private Date createDate;                // 신고생성일
    private Date updateDate;                // 신고수정일
    private String complaintYn;             // 신고 승인여부
    private String complaintDeleteYn;             // 신고 삭제여부
}
