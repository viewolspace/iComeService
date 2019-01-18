package com.icome.service.impl;

import com.icome.dao.ProgramDAO;
import com.icome.dao.ProgramDetailDAO;
import com.icome.pojo.Program;
import com.icome.pojo.ProgramDetail;
import com.icome.service.IProgramService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2019/1/18.
 */
@Service("programService")
public class ProgramServiceImpl implements IProgramService {

    @Resource
    private ProgramDAO programDAO;

    @Resource
    private ProgramDetailDAO programDetailDAO;

    @Override
    public List<Program> list() {
        return programDAO.list();
    }

    @Override
    public ProgramDetail getProgramDetail(String ticket) {
        return programDetailDAO.getProgramDetail(ticket);
    }

    @Transactional("icomeTX")
    @Override
    public int vote(String ticket, int programId) {

        ProgramDetail programDetail = programDetailDAO.getProgramDetail(ticket);
        if(programDetail==null){

            try{
                programDetail = new ProgramDetail();
                programDetail.setTicket(ticket);
                programDetail.setProgramId(programId);
                programDetail.setCreateTime(new Date());
                programDetailDAO.saveProgramDetail(programDetail);

                programDAO.updateNum(programId);

                return 1;
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return 0;
    }
}
