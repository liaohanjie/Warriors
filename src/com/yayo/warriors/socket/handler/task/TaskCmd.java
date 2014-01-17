package com.yayo.warriors.socket.handler.task;

import java.util.Map;

import com.yayo.warriors.module.task.entity.UserEscortTask;
import com.yayo.warriors.module.task.entity.UserMapTask;
import com.yayo.warriors.module.task.entity.UserPracticeTask;
import com.yayo.warriors.module.task.entity.UserTask;
import com.yayo.warriors.module.task.vo.LoopTaskVo;
import com.yayo.warriors.module.task.vo.PracticeTaskVO;


public interface TaskCmd {
	
	int LIST_USER_TASK = 1;
	int QUERY_USER_TASK = 2;
	int ACCEPT_USER_TASK = 3;
	int CANCEL_USER_TASK = 4;
	int COMPLETE_USER_TASK = 5;
	int REWARDS_USER_TASK = 6;
	int COMPLETE_TALK_USERTASK = 7;
	int COLLECT = 41;
	int QUERY_LOOPTASK = 61;
	int ACCEPT_LOOPTASK = 62;
	int FAST_COMPLETE_LOOPTASK = 64;
	int REWARD_LOOPTASK = 65;
	int COMPLETE_LOOPTASK = 66;
	int COMPLETE_TALK_LOOPTASK = 67;
	int REFRESH_LOOPTASK_QUALITY = 68;
	int GIVEUP_LOOPTASK = 69 ;
	int GET_LOOP_REWARD = 70 ;
	int CAMP_TASK_INFO = 75 ;
	int CAMP_TASK_APPEPT = 76 ;
	int CAMP_TASK_GIVPUP = 77 ;
	int CAMP_TASK_SUBMIT = 78 ;
	int COMPLETE_CAMP_TALK_CAMPTASK = 79;
	int LIST_MAP_TASK = 90;
	int QUERY_MAP_TASK = 91;
	int ACCEPT_MAPTASK = 92;
	int CANCEL_MAPTASK = 93;
	int COMPLETE_MAPTASK = 94;
	int REWARDS_MAPTASK = 95;
	int COMPLETE_TALK_MAPTASK = 96;
	int QUERY_PRACTICE_TASK = 100;
	int ACCEPT_PRACTICE_TASK = 101;
	int REWARD_PRACTICE_TASK = 102;
	int REFRESH_PRACTICE_TASK_QUALITY = 103;
	int GIVEUP_PRACTICE_TASK = 104;
	int GET_PRACTICE_REWARD = 105;
	int FAST_COMPLETE_PRACTICE_TASK = 106;
	int ESCORT_DUTIES_INFO = 300 ;
	int ACCEPT_ESCORT_DUTIES = 301 ;
	int GIVE_UP_ESCORT_DUTIES = 302 ;
	int UPDATE_ESCORT_TASK = 303;
	int COMPLETE_ESCORT_DUTIES = 304;
	int REFRESH_ESCORT_TASK_QUALITY = 305;
	int REFRESH_ESCORT_QUALITY_TO_ORANGE = 306;
	int REFRESH_ESCORT_QUALITY = 307;
	int LIST_ALLIANCE_TASK = 400;
	int REWARD_ALLIANCE_TASK = 401;
	int ACCEPT_ALLIANCE_TASK = 402;
	int COMPLETE_ALLIANCE_TALK_TASK = 403;
	int CANCEL_ALLIANCE_TASK_TASK = 404;
	int PUSH_TASK_2_CLIENT = 200;
	int PUSH_LOOPTASK = 201;
	int PUSH_MAPTASK_2_CLIENT = 202;
	int PUSH_PRACTICE_TASK_2_CLIENT = 203;
	int PUSH_CAMP_TASK_2_CLIENT = 204;
	int PUSH_ESCORT_PLUNDER = 205;
	int PUSH_ESCORT_RIDING = 206;
	int PUSH_ALLIANCE_TASK_2_CLIENT = 207;

}
