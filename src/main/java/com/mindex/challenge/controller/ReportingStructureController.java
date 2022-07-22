package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private ReportingStructureService reportingstructure;

    @GetMapping("/numberOfReports/{id}")
    public ReportingStructure read(@PathVariable String id) {
        LOG.debug("Received request for number of reports for id [{}]", id);

        return reportingstructure.read(id);
    }

}
