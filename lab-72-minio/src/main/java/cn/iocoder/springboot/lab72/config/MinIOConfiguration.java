package cn.iocoder.springboot.lab72.config;

import io.minio.MinioClient;
import org.springframework.context.annotation.*;

@Configuration
public class MinIOConfiguration {

    @Bean
    public MinioClient minioClient() {
        // Minio 配置。实际项目中，定义到 application.yml 配置文件中
        String endpoint = "http://117.72.79.63:9000";
        String accessKey = "zhoujian";
        String secretKey = "zhoujian123";

        // 创建 MinioClient 客户端
        return MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey, secretKey)
                .build();
    }

}
