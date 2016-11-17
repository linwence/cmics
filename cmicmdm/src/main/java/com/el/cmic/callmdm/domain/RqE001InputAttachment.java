package com.el.cmic.callmdm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Vincent on 2016/9/20.
 */
@XmlRootElement(name = "subcontent")
@XmlAccessorType(XmlAccessType.FIELD)
public class RqE001InputAttachment {
    private String filename;//  <filename>文件名称</filename>
    private String filename2;//  <filename2>文件名称2</filename2>
    private String filepath;//  <filepath>文件路径</filepath>
    private String filesize;// <filesize>文件大小</filesize>
    private String fileno;

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename2() {
        return filename2;
    }

    public void setFilename2(String filename2) {
        this.filename2 = filename2;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    @Override
    public String toString() {
        return "RqE001InputAttachment{" +
                "filename='" + filename + '\'' +
                ", filename2='" + filename2 + '\'' +
                ", filepath='" + filepath + '\'' +
                ", filesize='" + filesize + '\'' +
                '}';
    }
}
