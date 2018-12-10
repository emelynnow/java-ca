package lecturer.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
	
	@Entity
	@Table(name="LecturerCourse")
	@EntityListeners(AuditingEntityListener.class)
	public class LecturerCourse {
		
		public LecturerCourse() {

		}

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int teachingId;
		
		private String status;
		
		@NotBlank
		private int courseId;
		
		@NotBlank
		private int userId;

		public int getTeachingId() {
			return teachingId;
		}

		public void setTeachingId(int teachingId) {
			this.teachingId = teachingId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}
		
		
}
	