'use strict';
$(document).ready(function (){

    basicSearch();
    $("#user_nm").val($("#user_nm_tmp").text());
});

// 기본 상세화면 모든 데이터 조회
function basicSearch() {
    comDoAction("search","sgc_007_01");
}

// 부분조회 - 답글 / 댓글
function basicSearch_02() {
    comDoAction("commonBoardReplySearch","sgc_007_01");
}

// 부분조회 - 좋아요 영역
function basicSearch_03() {
    comDoAction("commonSearchLikeIcon","sgc_007_01");
}

function MoveMainBoard() {
    movePage('sgc_007_01');
}

function MoveBoardDetail() {
    movePage('sgc_007_01_02');
}

// function doAction(acNm,replyNo) {
//     let reqUrl, data, formName, bindId, callback;
//     switch(acNm) {
//         case "save":
//             if(validation(replyNo)) {
//                 break;
//             }
//             // 사용자 id input value 에 셋팅
//             $("#user_id").val($("#text_user_id").text());
//             if(replyNo != undefined) {
//                 $("#reply_cntn").val($("#text_reply_cntn"+replyNo).val());
//                 $("#reply_no").val(replyNo);
//             } else {
//                 $("#reply_cntn").val($("#text_reply_cntn").val());
//                 $("#reply_no").val("");
//             }

//             reqUrl = "page_007_01_02-SAVE";
//             data = null;
//             formName = "hiddenForm";
//             bindId = null;
//             callback = reSearch();
//             ajaxCall(reqUrl,data,formName,bindId,callback);
//             break;
//         case "delete":
//             $(".boardReply__cntn.reply_del"+replyNo).remove();
//             break;

//     }
// }

//  답글작성 폼 생성
// function makeReplyForm(replyNo,replyNoId) {
//     doAction('delete',replyFormNo);
//     replyFormNo = replyNo;
//     let user_nm = $("#user_nm").val();
//     let appendCntn = '<div class="boardReply__cntn reply_del'+replyNo+'" style="margin: 0 0 20px 55px;" >' +
//                         '<div class="boardReply__cntn__outterLine">' +
//                             '<div class="boardReply__user_nm">' +
//                                 '<p >'+user_nm+'</p>' +
//                             '</div>' +
//                             '<textarea name="text_reply_cntn'+replyNo+'" id="text_reply_cntn'+replyNo+'" placeholder="댓글을 남겨보세요" onkeydown="resize(this)" onkeyup="resize(this)"></textarea>' +
//                             '<div class="reply__bottom">' +
//                                 '<div class="optionItems">' +
//                                     '<i class="fas fa-camera-retro"></i>' +
//                                     '<i class="far fa-smile"></i>' +
//                                 '</div>' +
//                                 '<div class="replyRegBtn">' +
//                                     '<button class="btn" type="button" style="margin-right:5px;" onclick="doAction(\'delete\','+replyNo+')">취소</button>' +
//                                     '<button class="btn" type="button" onclick="doAction(\'save\','+replyNo+')">등록</button>' +
//                                 '</div>' +
//                             '</div>' +
//                         '</div>' +
//                      '</div>'; 
//     $("#reply_"+replyNoId).append(appendCntn);
// }

// 입력 값 유효성 체크
// function validation(replyNo) {
//     let isErr = false;
//     let errMsg = "";
//     let conText = replyNo == undefined ? "" : replyNo;
//     if(isNull($("#text_reply_cntn"+conText).val())) {
//         errMsg = "내용을 입력 하세요.";
//         isErr = true;
//         $("#text_reply_cntn"+conText).focus();
//     }

//     if(isErr) {
//         alert(errMsg);
//     }
//     return isErr
// }
