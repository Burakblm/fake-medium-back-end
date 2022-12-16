package databaseproject.fakeMedium.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="articles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="article_id")
	private int id;
	
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="article_number_of_like")
	private int articleNumberOfLike;
	
	@Column(name="article_release_date")
	private String articleReleaseDate;
	
	@Column(name="article_title")
	private String articleTitle;
	
	@Column(name="article_image_url")
	private String articleImageUrl;
	
	@Column(name="article_writing")
	private String articleWriting;
	

}
