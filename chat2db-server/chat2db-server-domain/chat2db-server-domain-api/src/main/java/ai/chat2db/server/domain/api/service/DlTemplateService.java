package ai.chat2db.server.domain.api.service;

import ai.chat2db.server.domain.api.param.DlCountParam;
import ai.chat2db.server.domain.api.param.DlExecuteParam;
import ai.chat2db.spi.model.ExecuteResult;
import ai.chat2db.server.tools.base.wrapper.result.DataResult;

import ai.chat2db.server.tools.base.wrapper.result.ListResult;

/**
 * 数据源管理服务
 *
 * @author moji
 * @version DataSourceCoreService.java, v 0.1 2022年09月23日 15:22 moji Exp $
 * @date 2022/09/23
 */
public interface DlTemplateService {

    /**
     * 数据源执行dl
     *
     * @param param
     * @return
     */
    ListResult<ExecuteResult> execute(DlExecuteParam param);

    /**
     * 执行统计sql
     *
     * @param param
     * @return
     */
    DataResult<Long> count(DlCountParam param);

    /**
     * 数据源执行dl,分页操作
     *
     * @param param
     * @return
     */
    ListResult<ExecuteResult> executePage(DlExecuteParam param);

}
