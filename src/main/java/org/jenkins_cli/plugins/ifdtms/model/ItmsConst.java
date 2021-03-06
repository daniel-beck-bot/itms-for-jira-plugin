package org.jenkins_cli.plugins.ifdtms.model;

public class ItmsConst {

    public static final String PLUGIN_NAME = "iTMS for Jenkins";
    public static final String POST_BUILD_NAME = "Publish test result to iTMS";
    public static final String SERVICE_NAME = "jenkins";


    public static final String JSON_FORMAT = "Cucumber Json";
    public static final String XML_FORMAT = "JUnit";

    // Media Type
    public static final String APPLICATION_JSON_TYPE = "Content-Type: application/json; charset=";
    public static final String APPLICATION_XML_TYPE = "Content-Type: application/xml; charset=";
    public static final String TEXT_PLAIN_TYPE = "Content-Type: text/plain; charset=";

    // Param request
    public static final String ITMS_SERVER_PARAM = "itmsServer";
    public static final String USER_NAME_PARAM = "username";
    public static final String SERVICE_NAME_PARAM = "service_name";
    public static final String PROJECT_NAME_PARAM = "project_key";
    public static final String TICKET_KEY_PARAM = "ticket_key";
    public static final String CYCLE_NAME_PARAM = "cycle_name";
    public static final String IS_JSON_PARAM = "is_json";
    public static final String TOKEN_PARAM = "token";
    public static final String ATTRIBUTE_BUILD_NUM_PARAM = "jenkins_auto_executions_attributes[][build_number]";
    public static final String ATTRIBUTE_BUILD_STATUS_PARAM = "jenkins_auto_executions_attributes[][build_status]";
    public static final String ATTRIBUTE_USER_PARAM = "jenkins_auto_executions_attributes[][user]";
    public static final String ATTRIBUTE_REPORT_TYPE_PARAM = "jenkins_auto_executions_attributes[][report_type]";
}
