package com.springapp.mvc.service;

import com.springapp.mvc.dao.ProjectDao;
import com.springapp.mvc.domain.Project;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by KhangTN1 on 1/18/2016.
 */
@Service
public class InitService implements InitializingBean {

    @Autowired
    ProjectDao projectDao;

    @Override
    public void afterPropertiesSet() throws Exception {
       Project project1 = new Project("facebook",new Date(),
               "We are glad to announce our second free WordPress theme. " +
                       "Pine is a free minimalist WordPress portfolio theme " +
                       "created for people who want to show their work in a simple" +
                       " and creative way. You can find the source on Github.","Mark","WEB APPLICATION");
        Project project2 = new Project("Google",new Date(),
                "A creative WordPress theme mainly related for portfolio " +
                        "showcase and blogging with plenty of layout designs, " +
                        "theme options and rich drag and drop content builder elements " +
                        "to create your portfolio and/or personal blog site in minutes.","Euro","WEB APPLICATION");

        Project project3 = new Project("IndiaSin",new Date(),
                "Lemosys Infotech " +
                        "IT company based in India. An experienced and professional team " +
                        "for website development & web design.","Euro","WEB APPLICATION");

        Project project4 = new Project("IFOR",new Date(),
                "A redesigned design agency’s website to incorporate new web technological advances. " +
                        "The theme is based on responsive components from the Bootstrap 3 framework as well as" +
                        " other customizations.","CapeTown","WEB APPLICATION");

        Project project5 = new Project("TECH",new Date(),
                "Yet another Responsive Multipurpose WordPress Theme with magnetic appeal that creates an " +
                        "invariably magical impact on the buyers visiting your WooCommerce site, restaurant, " +
                        "online store, corporate, consulting or other commercial site. BeTheme is loaded with" +
                        " highly modern and useful features that not only make your site free from all the technical" +
                        " issues but also establish it in a distinct manner.","VIETNAM","WEB APPLICATION");
        Project project6 = new Project("Sturlly",new Date(),
                "Sturlly is a creative, clean and professional one page responsive template built using HTML5 and Bootstrap. " +
                        "It contains different options, pre-made layouts for different businesses and other extra pages like" +
                        " Blog and Coming Soon. It is well designed, tested, documented, easily customisable and really " +
                        "perfect fits for businesses like SPA salon, fashion, restaurant, travel, interior, architecture, " +
                        "design agency, personal resume and many more…","TOKEN","WEB APPLICATION");

        List<Project> projects = new ArrayList<Project>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);
        projects.add(project4);
        projects.add(project5);
        projects.add(project6);
        projectDao.save(projects);
    }
}
