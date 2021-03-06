package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceMapper {
    public Resource getResource();

    public void createResource(Resource resource);

    public List<Resource> getListResources();

    public void updateResource(Resource resource);

    public List<Resource> searchResourceType(@Param("tipo") String tipo);

    public List<Resource> searchResourceCapacity(@Param("capacidad") String capacidad);

    public List<Resource> searchResourcelocation(@Param("ubicacion") String ubicacion);

}
