package com.church.simgokchyun.common.common;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.church.simgokchyun.common.vo.Board;
import com.church.simgokchyun.common.vo.BoardLike;
import com.church.simgokchyun.common.vo.BoardReReply;
import com.church.simgokchyun.common.vo.BoardReply;
import com.church.simgokchyun.common.vo.Comcode;
import com.church.simgokchyun.common.vo.User;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommonMapper {
 
    /**
     * 공통코드 조회
     * @param cd_grp_enm
     * @return
     * @throws Exception
     */
    List<Comcode> select_com_code(String cd_grp_enm) throws Exception;

    /**
     * 게시글 목록 조회
     * @param board
     * @return
     * @throws Exception
     */
    List<Board> select_boardList(Board board)throws Exception;

    /**
     * 게시글 상세 조회
     * @param board
     * @return
     * @throws Exception
     */
    Board select_boardDetail(Board board)throws Exception;

    /**
     * 상세 게시글  댓글 조회
     * @param board
     * @return
     * @throws Exception
     */
    List<BoardReply> select_boardReply(Board board)throws Exception;

    /**
     * 게시글 저장
     * @param board
     * @return
     * @throws Exception
     */
    int insertBoard(Board board)throws Exception;

    /**
     * 게시글 삭제
     * @param board
     * @return
     * @throws Exception
     */
    int updateBoardDeleteY(Board board)throws Exception;

    /**
     * 총 게시글 목록 count
     * @param board
     * @return
     * @throws Exception
     */
    int getTotalCnt(Board board)throws Exception;

    /**
     * 업로드 파일정보 저장
     * @param paramMap
     * @return
     * @throws Exception
     */
    int fileSave(Map<String, Object> paramMap)throws Exception;

    /**
     * 업로드 파일 ID 조회
     * @param paramMap
     * @return
     * @throws Exception
     */
    String getFileId(Map<String, Object> paramMap)throws Exception; 

    /**
     * 이메일 중복여부
     * @param user
     * @return
     * @throws Exception
     */
    String emailDubYn(User user)throws Exception;

    /**
     * 회원가입
     * @param user
     * @return
     * @throws Exception
     */
    int joinUser(User user)throws Exception;

    /**
     * 사용자 정보 조회 used email
     * @param email_addr
     * @return
     */
    User findByUsername(String email_addr);

    /**
     * 사용자 id
     * @param user
     * @return
     * @throws Exception
     */
    String getUserId(User user) throws Exception;

    /**
     * 사용자 password 변경
     * @param user
     * @return
     * @throws Exception
     */
    int changeUserPw(User user) throws Exception;


    /**
     * 사용자 정보 조회 used userId
     * @param user
     * @return
     * @throws Exception
     */
    User getUser(User user)throws Exception;

    /**
     * 사용자 인증여부 활성화
     * @param user
     * @return
     * @throws Exception
     */
    int successJoin(User user) throws Exception;

    /**
     * 사용자 정보 조회 used email
     * @param email
     * @return
     * @throws Exception
     */
    Optional<User> findByUserInfo(String email)throws Exception;

    /**
     * 게시글의 오늘 좋아요 중복 여부를 확인한다.
     * @param boardLike
     * @return Map<String,Object>
     * @throws Exception
     */
    Map<String, Object> getBoardLikeExistYn(BoardLike boardLike)throws Exception;

    /**
     * 댓글 추가
     * @param boardReply
     * @return int
     * @throws Exception
     */
    int insertBoardReply(BoardReply boardReply)throws Exception;


    /**
     * 댓글 수정
     * @param boardReply
     * @return int
     * @throws Exception
     */
    int updateBoardReply(BoardReply boardReply)throws Exception;


    /**
     * 답글 추가
     * @param boardReReply
     * @return int
     * @throws Exception
     */
    int insertBoardReReply(BoardReReply boardReReply)throws Exception;


    /**
     * 답글 수정
     * @param boardReReply
     * @return
     * @throws Exception
     */
    int updateBoardReReply(BoardReReply boardReReply)throws Exception;


    /**
     * 댓글 삭제
     * @param boardReReply
     * @return int
     * @throws Exception
     */
    int deleteBoardReply(BoardReply boardReply)throws Exception;

    /**
     * 답글 삭제
     * @param boardReReply
     * @return int
     * @throws Exception
     */
    int deleteBoardReReply(BoardReply boardReply)throws Exception;


    /**
     * 조회고객 정보 INSERT
     * @param boardLike
     * @return
     * @throws Exception
     */
    int insertBoardlike(BoardLike boardLike) throws Exception;

    /**
     * 조회고객 정보 UPDATE
     * @param boardLike
     * @return
     * @throws Exception
     */    
    int updateBoardlike(BoardLike boardLike) throws Exception;
    
    /**
     * 게시글 조회 수 증가
     * @param boardLike
     * @return
     * @throws Exception
     */
    int increaseBoard(BoardLike boardLike) throws Exception;
    
    /**
     * 좋아요 클릭여부
     * @param boardLike
     * @return
     * @throws Exception
     */
    String getLikeYn(BoardLike boardLike) throws Exception;
    
    /**
     * 게시글의 좋아요 정보를 삭제(DEL_YN = 'Y')한다.
     * @param boardLike
     * @return
     * @throws Exception
     */
    int onBoardLike(BoardLike boardLike) throws Exception;

    /**
     * 게시글의 좋아요 정보를 생성(INSERT / UPDATE)
     * @param boardLike
     * @return
     * @throws Exception
     */
    int offBoardLike(BoardLike boardLike) throws Exception;

    /**
     * 대메뉴 목록
     * @return List<Comcode>
     * @throws Exception
     */
    List<Comcode> getMenu_lv01(String code) throws Exception;

    /**
     * 중메뉴 목록
     * @param code
     * @return List<Comcode>
     * @throws Exception
     */
    List<Comcode> getMenu_lv02(String code01, String code02) throws Exception;


}


