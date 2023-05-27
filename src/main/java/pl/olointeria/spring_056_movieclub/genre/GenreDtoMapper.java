package pl.olointeria.spring_056_movieclub.genre;

import pl.olointeria.spring_056_movieclub.genre.dto.GenreDto;

class GenreDtoMapper {
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
