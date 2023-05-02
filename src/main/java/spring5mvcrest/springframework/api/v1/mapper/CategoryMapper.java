package spring5mvcrest.springframework.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import spring5mvcrest.springframework.api.v1.model.CategoryDTO;
import spring5mvcrest.springframework.domain.Category;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    @Mapping(source = "id", target = "id")
    CategoryDTO categoryDTOtoCategoryDTO(Category category);
}
