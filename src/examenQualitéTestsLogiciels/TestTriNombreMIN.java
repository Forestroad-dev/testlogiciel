package examenQualitéTestsLogiciels;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class TestTriNombreMIN {
	
	@ParameterizedTest(name = "MIN tableau {0} tri� en {1}")
	@MethodSource("algoTri")
	void testAlgoTri(final int[] entrée, final int[] sortie) {
		TriNombreMIN.trierNombre(entrée);
		assertArrayEquals(sortie, entrée);
	}
	
	static Stream<Arguments> algoTri(){
		return Stream.of(
				Arguments.of(new int[] { -1220, -1210, -1200 }, new int[] { -1220, -1210, -1200 }),
				Arguments.of(new int[] { 2220, 2121, 2202 }, new int[] { 2220, 2121, 2202 }),
				Arguments.of(new int[] { -3220, -3210, -3200 }, new int[] { -3200, -3210, -3220 }),
				Arguments.of(new int[] { 4999, 4998, 1997 }, new int[] { 1997, 4998, 4999 })
				);
	}
}
