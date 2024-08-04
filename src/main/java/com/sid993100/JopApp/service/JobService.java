package com.sid993100.JopApp.service;

import com.sid993100.JopApp.model.JobPost;
import com.sid993100.JopApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepo repo;

    @Autowired
    public JobService(JobRepo repo) {
        this.repo = repo;
    }

    public void addJob(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.returnAllJobPosts();
    }
}
