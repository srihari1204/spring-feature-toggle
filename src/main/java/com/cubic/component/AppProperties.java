package com.cubic.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("app") // prefix app, find app.* values
public class AppProperties {

    private String error;
    private List<Menu> menus = new ArrayList<>();
    private Compiler compiler = new Compiler();

    public static class Menu {
        private String name;
        private String path;
        private String title;

        public void setName(String name) {
            this.name = name;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public String getPath() {
            return path;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "Menu{" +
                    "name='" + name + '\'' +
                    ", path='" + path + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

    public static class Compiler {
        private String timeout;
        private String outputFolder;

        public void setTimeout(String timeout) {
            this.timeout = timeout;
        }

        public void setOutputFolder(String outputFolder) {
            this.outputFolder = outputFolder;
        }

        public String getTimeout() {
            return timeout;
        }

        public String getOutputFolder() {
            return outputFolder;
        }

        @Override
        public String toString() {
            return "Compiler{" +
                    "timeout='" + timeout + '\'' +
                    ", outputFolder='" + outputFolder + '\'' +
                    '}';
        }

    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }

    public String getError() {
        return error;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public Compiler getCompiler() {
        return compiler;
    }

    @Override
    public String toString() {
        return "AppProperties{" +
                "error='" + error + '\'' +
                ", menus=" + menus +
                ", compiler=" + compiler +
                '}';
    }
}