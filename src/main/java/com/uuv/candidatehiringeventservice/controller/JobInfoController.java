package com.uuv.candidatehiringeventservice.controller;

import com.uuv.candidatehiringeventservice.model.JobInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobInfo")
public class JobInfoController {

    @GetMapping("/{uid}")
    public JobInfo getByUid(@PathVariable String uid) {
        return null;
    }

    /**
     * @param startDate start date
     * @param endDate
     * @return the jobs posted between {@code startDate}& {@code endDate}
     */
    @GetMapping("/{startDate}/{endDate}")
    public List<JobInfo> getByDateRange(@PathVariable String startDate, @PathVariable String endDate) {
        return null;
    }

    @PostMapping("/")
    public JobInfo createJob(@RequestBody JobInfo jobInfo) {
        return null;
    }

    @PutMapping("/{uid}")
    public JobInfo updateJob(@PathVariable String uid, @RequestBody JobInfo jobInfo) {
        return null;
    }

    @DeleteMapping("/{uid}")
    public String removeJob(@PathVariable String uid) {
        return uid;
    }
}
