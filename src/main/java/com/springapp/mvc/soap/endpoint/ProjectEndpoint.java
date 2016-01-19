package com.springapp.mvc.soap.endpoint;

import com.springapp.mvc.dao.ProjectDao;
import com.springapp.mvc.domain.Project;
import com.springapp.mvc.soap.object.ProjectRequest;
import com.springapp.mvc.soap.object.ProjectRespone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

/**
 * Created by KhangTN1 on 1/19/2016.
 */
@Endpoint
public class ProjectEndpoint {
    private static final String NAMESPACE_URI = "http://khang.com/testsoap/test";

    @Autowired
    private ProjectDao projectDao;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProjectRequest")
    @ResponsePayload
    public ProjectRespone getProject(@RequestPayload ProjectRequest projectRequest) {
        ProjectRespone projectRespone = new ProjectRespone();
        try {
            projectRespone.setProject(convertEntity(projectDao.findOne(projectRequest.getId())));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return projectRespone;
    }

    private com.springapp.mvc.soap.object.Project convertEntity(Project project) throws DatatypeConfigurationException {
        com.springapp.mvc.soap.object.Project projectSoap = new com.springapp.mvc.soap.object.Project();
        projectSoap.setId(project.getId());
        projectSoap.setName(project.getName());
        projectSoap.setCustomer(project.getCustomer());
        projectSoap.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(project.getDate().getYear(), project.getDate().getMonth(), project.getDate().getDate())));
        projectSoap.setDetail(project.getDetail());
        projectSoap.setService(project.getService());
        return projectSoap;
    }
}
