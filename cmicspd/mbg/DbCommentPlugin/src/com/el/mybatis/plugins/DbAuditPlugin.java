package com.el.mybatis.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
public class DbAuditPlugin extends PluginAdapter {

    private static final FullyQualifiedJavaType DATA_TYPE_AUDIT = new FullyQualifiedJavaType("com.el.sys.domain.DbAudit");

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        generateSetAudit(introspectedTable, topLevelClass);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(
        TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        generateSetAudit(introspectedTable, topLevelClass);
        return true;
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        generateSetAudit(introspectedTable, topLevelClass);
        return true;
    }

    private void generateSetAudit(IntrospectedTable introspectedTable,
                                  TopLevelClass topLevelClass) {
        if (topLevelClass.getType().getShortName().startsWith("T")) {
            Method method = new Method();
            method.setVisibility(JavaVisibility.PUBLIC);
            method.addParameter(new Parameter(DATA_TYPE_AUDIT, "audit"));
            method.setName("setAudit"); //$NON-NLS-1$

            context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

            method.addBodyLine("this.modifyerId = audit.getUserId();"); //$NON-NLS-1$
            method.addBodyLine("this.modifyModule = audit.getProgId();"); //$NON-NLS-1$
            method.addBodyLine("this.modifyAppsvr = audit.getNodeId();"); //$NON-NLS-1$

            topLevelClass.addImportedType(DATA_TYPE_AUDIT);
            topLevelClass.addMethod(method);
        }
    }
}
