package myspring

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PersonTest {

    @Test
    fun plain() {
        val person = Person("Jan", 21)

        assertThat(person).isNotNull()
        assertThat(person.name).isEqualTo("Jan")
    }

    @Test
    fun with() {
        val person = Person("Jan", 21)

        with(person) {
            assertThat(this).isNotNull()
            assertThat(name).isEqualTo("Jan")
        }
    }

    @Test
    fun isMature() {
        assertThat(Person("Jan", 1000).isMature()).isTrue()
        assertThat(Person("Jan", 100).isMature()).isTrue()
        assertThat(Person("Jan", 19).isMature()).isTrue()
        assertThat(Person("Jan", 18).isMature()).isTrue()

        assertThat(Person("Jan", 17).isMature()).isFalse()
        assertThat(Person("Jan", 0).isMature()).isFalse()
        assertThat(Person("Jan", -10).isMature()).isFalse()
    }

    @Test
    fun weight() {
        val person = Person("Jan", 19)

        person.weight = 81.6
        person.weight = 100.0

        assertThat(person.weightChanges).containsExactly(81.6, 100.0)
    }
}
