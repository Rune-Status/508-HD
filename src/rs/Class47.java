/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.io.js5.CacheFileWorker;

public class Class47 {
	public static Class94 aClass94_784;
	public static Class124 aClass124_787;
	public static boolean aBoolean788 = true;
	public static CacheFileWorker aCacheFileWorker_790;
	public static Class124 aClass124_793;
	public static int anInt796;

	static {
		aClass124_787 = Class124.method263("Sprites geladen)3");
		aClass124_793 = Class124.method263(" <col=ffffff>");
		anInt796 = -1;
	}

	public static Class4 method1180(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null || class14_sub29.aClass4_3237 == null)
			return null;
		return class14_sub29.aClass4_3237;
	}

	public static void method1181(int i, int i_2_, int i_3_, byte i_4_) {
		if (Class14_Sub29.anInt3266 != 0 && i != 0 && JunkTex.anInt96 < 50 && i_2_ != -1) {
			Class153.anIntArray2454[JunkTex.anInt96] = i_2_;
			Static2.anIntArray4052[JunkTex.anInt96] = i;
			Static2.anIntArray3949[JunkTex.anInt96] = i_3_;
			Class137.aClass91Array2197[JunkTex.anInt96] = null;
			Class116.anIntArray1928[JunkTex.anInt96] = 0;
			JunkTex.anInt96++;
		}
	}

	public static int method1182(int i, int i_5_) {
		if (JunkTex.language == 1) {
			int i_6_ = 7;
			return i_6_;
		}
		if (JunkTex.language == 2) {
			int i_7_ = 20;
			return i_7_;
		}
		int i_8_ = i;
		while_338_: do {
			while_337_: do {
				while_336_: do {
					while_335_: do {
						while_334_: do {
							while_333_: do {
								while_332_: do {
									while_331_: do {
										while_330_: do {
											while_329_: do {
												while_328_: do {
													while_327_: do {
														while_326_: do {
															while_325_: do {
																while_324_: do {
																	while_323_: do {
																		while_322_: do {
																			do {
																				if (i_8_ != 15) {
																					if (i_8_ != 16) {
																						if (i_8_ != 22) {
																							if (i_8_ != 31) {
																								if (i_8_ != 38) {
																									if (i_8_ != 43) {
																										if (i_8_ != 48) {
																											if (i_8_ != 58) {
																												if (i_8_ != 69) {
																													if (i_8_ != 74) {
																														if (i_8_ != 77) {
																															if (i_8_ != 101) {
																																if (i_8_ != 103) {
																																	if (i_8_ != 152) {
																																		if (i_8_ != 161) {
																																			if (i_8_ != 162) {
																																				if (i_8_ != 166) {
																																					if (i_8_ != 179) {
																																						if (i_8_ == 191)
																																							break while_337_;
																																						break while_338_;
																																					}
																																				} else
																																					break while_335_;
																																				break while_336_;
																																			}
																																		} else
																																			break while_333_;
																																		break while_334_;
																																	}
																																} else
																																	break while_331_;
																																break while_332_;
																															}
																														} else
																															break while_329_;
																														break while_330_;
																													}
																												} else
																													break while_327_;
																												break while_328_;
																											}
																										} else
																											break while_325_;
																										break while_326_;
																									}
																								} else
																									break while_323_;
																								break while_324_;
																							}
																						} else
																							break;
																						break while_322_;
																					}
																				} else {
																					int i_9_ = 13;
																					return i_9_;
																				}
																				int i_10_ = 3;
																				return i_10_;
																			} while (false);
																			int i_11_ = 8;
																			return i_11_;
																		} while (false);
																		int i_12_ = 14;
																		return i_12_;
																	} while (false);
																	int i_13_ = 2;
																	return i_13_;
																} while (false);
																int i_14_ = 15;
																return i_14_;
															} while (false);
															int i_15_ = 17;
															return i_15_;
														} while (false);
														int i_16_ = 11;
														return i_16_;
													} while (false);
													int i_17_ = 6;
													return i_17_;
												} while (false);
												int i_18_ = 20;
												return i_18_;
											} while (false);
											int i_19_ = 1;
											return i_19_;
										} while (false);
										int i_20_ = 12;
										return i_20_;
									} while (false);
									int i_21_ = 19;
									return i_21_;
								} while (false);
								int i_22_ = 16;
								return i_22_;
							} while (false);
							int i_23_ = 4;
							return i_23_;
						} while (false);
						int i_24_ = 9;
						return i_24_;
					} while (false);
					int i_25_ = 10;
					return i_25_;
				} while (false);
				int i_26_ = 18;
				return i_26_;
			} while (false);
			int i_27_ = 5;
			return i_27_;
		} while (false);
		if (i_5_ != -1)
			aCacheFileWorker_790 = null;
		int i_28_ = 0;
		return i_28_;
	}

	public static void method1183(byte i, SceneGraphNode_GameEntity class133_sub1) {
		if (class133_sub1.anInt3492 != 0) {
			if (class133_sub1.anInt3453 != -1 && class133_sub1.anInt3453 < 32768) {
				SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = (Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[class133_sub1.anInt3453]);
				if (class133_sub1_sub2 != null) {
					int i_29_ = (class133_sub1.anInt3495 - class133_sub1_sub2.anInt3495);
					int i_30_ = (-class133_sub1_sub2.anInt3436 + class133_sub1.anInt3436);
					if (i_29_ != 0 || i_30_ != 0)
						class133_sub1.anInt3469 = (int) (Math.atan2(i_29_, i_30_) * 325.949) & 0x7ff;
				}
			}
			if (class133_sub1.anInt3453 >= 32768) {
				int i_31_ = class133_sub1.anInt3453 - 32768;
				if (Class14_Sub2_Sub10.anInt3868 == i_31_)
					i_31_ = 2047;
				SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1 = JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_31_];
				if (class133_sub1_sub1 != null) {
					int i_32_ = (class133_sub1.anInt3495 - class133_sub1_sub1.anInt3495);
					int i_33_ = (-class133_sub1_sub1.anInt3436 + class133_sub1.anInt3436);
					if (i_32_ != 0 || i_33_ != 0)
						class133_sub1.anInt3469 = (int) (Math.atan2(i_32_, i_33_) * 325.949) & 0x7ff;
				}
			}
			if ((class133_sub1.anInt3504 != 0 || class133_sub1.anInt3480 != 0)
					&& (class133_sub1.anInt3498 == 0 || class133_sub1.anInt3437 > 0)) {
				int i_34_ = (class133_sub1.anInt3495 - 64 - (-(class133_sub1.anInt3493 * 64)
						+ (-SceneGraphNode_Projectile.anInt3676 - SceneGraphNode_Projectile.anInt3676 + class133_sub1.anInt3504) * 64));
				int i_35_ = (-((-Class58.anInt947 + (class133_sub1.anInt3480 - Class58.anInt947)) * 64)
						+ class133_sub1.anInt3436 - 64 + class133_sub1.anInt3493 * 64);
				if (i_34_ != 0 || i_35_ != 0)
					class133_sub1.anInt3469 = (int) (Math.atan2(i_34_, i_35_) * 325.949) & 0x7ff;
				class133_sub1.anInt3480 = 0;
				class133_sub1.anInt3504 = 0;
			}
			int i_36_ = class133_sub1.anInt3469 - class133_sub1.anInt3461 & 0x7ff;
			if (i > 115) {
				if (i_36_ != 0) {
					class133_sub1.anInt3479++;
					if (i_36_ > 1024) {
						class133_sub1.anInt3461 -= class133_sub1.anInt3492;
						boolean bool = true;
						if (class133_sub1.anInt3492 > i_36_ || -class133_sub1.anInt3492 + 2048 < i_36_) {
							class133_sub1.anInt3461 = class133_sub1.anInt3469;
							bool = false;
						}
						if (class133_sub1.anInt3433 == class133_sub1.anInt3452
								&& (class133_sub1.anInt3479 > 25 || bool)) {
							if (class133_sub1.anInt3471 != -1)
								class133_sub1.anInt3452 = class133_sub1.anInt3471;
							else
								class133_sub1.anInt3452 = class133_sub1.anInt3457;
						}
					} else {
						class133_sub1.anInt3461 += class133_sub1.anInt3492;
						boolean bool = true;
						if (class133_sub1.anInt3492 > i_36_ || -class133_sub1.anInt3492 + 2048 < i_36_) {
							bool = false;
							class133_sub1.anInt3461 = class133_sub1.anInt3469;
						}
						if (class133_sub1.anInt3433 == class133_sub1.anInt3452
								&& (class133_sub1.anInt3479 > 25 || bool)) {
							if (class133_sub1.anInt3454 != -1)
								class133_sub1.anInt3452 = class133_sub1.anInt3454;
							else
								class133_sub1.anInt3452 = class133_sub1.anInt3457;
						}
					}
					class133_sub1.anInt3461 &= 0x7ff;
				} else
					class133_sub1.anInt3479 = 0;
			}
		}
	}

	public static void method1184() {
		Class40.aClass14_Sub29ArrayArrayArray674 = null;
		JunkTex.anIntArrayArray2799 = null;
		OverlayType.underWaterTileHeightMap = null;
		Class131.aClass14_Sub27ArrayArray2162 = null;
	}

	public static int method1185(FileSystem fileSystem, boolean bool, FileSystem fileSystem_37_) {
		int i = 0;
		if (fileSystem_37_.method171(Class14_Sub2_Sub21.anInt4088))
			i++;
		if (fileSystem_37_.method171(JunkTex.anInt4367))
			i++;
		if (fileSystem_37_.method171(JunkTex.anInt4102))
			i++;
		if (!bool)
			anInt796 = -113;
		if (fileSystem.method171(Class14_Sub2_Sub21.anInt4088))
			i++;
		if (fileSystem.method171(JunkTex.anInt4367))
			i++;
		if (fileSystem.method171(JunkTex.anInt4102))
			i++;
		int i_38_ = i;
		return i_38_;
	}

	public static void method1186(int i) {
		aClass124_787 = null;
		aClass124_793 = null;
		aCacheFileWorker_790 = null;
		if (i == -192)
			aClass94_784 = null;
	}

	public static Class51 method1187(int i, boolean bool) {
		if (!bool) {
			Class51 class51 = null;
			return class51;
		}
		Class51 class51 = (Class51) JunkTex.aClass52_4240.get(i);
		if (class51 != null) {
			Class51 class51_39_ = class51;
			return class51_39_;
		}
		byte[] is = Class7_Sub1.aFileSystem_2652.method163(Class14_Sub15.method873(1023, i), Canvas_Sub2.method68(i, -1));
		Class51 class51_40_ = new Class51();
		if (is != null)
			class51_40_.method1198(new Buffer(is), 36);
		JunkTex.aClass52_4240.put(class51_40_, i);
		Class51 class51_41_ = class51_40_;
		return class51_41_;
	}

	public static void method1188(int i, int i_42_) {
		if (i_42_ == Class14_Sub2_Sub11.anInt3889)
			SceneGraphNode_SpotAnimation.aClass14_Sub9_Sub1_3625.method710(i_42_ - 28225, i);
		else
			JunkTex.anInt1132 = i;
	}

	public static boolean method1190(int i, int i_100_, int i_101_, int i_102_, int i_103_, boolean bool, int i_104_,
			int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_) {
		int i_111_ = -61 / ((60 - i_104_) / 60);
		for (int i_112_ = 0; i_112_ < 104; i_112_++) {
			for (int i_113_ = 0; i_113_ < 104; i_113_++) {
				Class33.anIntArrayArray575[i_112_][i_113_] = 0;
				Class137.anIntArrayArray2203[i_112_][i_113_] = 99999999;
			}
		}
		Class33.anIntArrayArray575[i_102_][i_100_] = 99;
		Class137.anIntArrayArray2203[i_102_][i_100_] = 0;
		i_111_ = i_100_;
		int i_114_ = i_102_;
		int i_115_ = 0;
		JunkTex.anIntArray4691[i_115_] = i_102_;
		Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_100_;
		int i_116_ = 0;
		boolean bool_117_ = false;
		int[][] is = (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel].anIntArrayArray546);
		while_346_: while (i_116_ != i_115_) {
			i_114_ = JunkTex.anIntArray4691[i_116_];
			i_111_ = Class14_Sub2_Sub21.anIntArray4078[i_116_];
			i_116_ = i_116_ + 1 & 0xfff;
			if (i_110_ == i_114_ && i == i_111_) {
				bool_117_ = true;
				break;
			}
			if (i_107_ != 0) {
				if (i_107_ >= 5 && i_107_ != 10 || !(Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel]
						.method1076(i_105_, i_106_, i_107_ - 1, i, i_110_, i_114_, i_111_, 18288))) {
					if (i_107_ < 10 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel].method1066(i_106_,
							i_107_ - 1, i_114_, i, i_111_, (byte) -10, i_105_, i_110_))) {
						bool_117_ = true;
						break;
					}
				} else {
					bool_117_ = true;
					break;
				}
			}
			if (i_108_ != 0 && i_109_ != 0 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel]
					.method1078(i_111_, i_109_, i_114_, i_103_, (byte) -63, i_110_, i, i_106_, i_108_))) {
				bool_117_ = true;
				break;
			}
			int i_118_ = Class137.anIntArrayArray2203[i_114_][i_111_] + 1;
			while_339_: do {
				if (i_114_ > 0 && Class33.anIntArrayArray575[i_114_ - 1][i_111_] == 0
						&& (is[i_114_ - 1][i_111_] & 0x12c010e) == 0
						&& ((is[i_114_ - 1][i_106_ + i_111_ - 1] & 0x12c0138) == 0)) {
					for (int i_119_ = 1; i_106_ - 1 > i_119_; i_119_++) {
						if ((is[i_114_ - 1][i_119_ + i_111_] & 0x12c013e) != 0)
							break while_339_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_] = 2;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_] = i_118_;
				}
			} while (false);
			while_340_: do {
				if (i_114_ < 102 && Class33.anIntArrayArray575[i_114_ + 1][i_111_] == 0
						&& (is[i_106_ + i_114_][i_111_] & 0x12c0183) == 0
						&& ((is[i_114_ + i_106_][i_106_ + i_111_ - 1] & 0x12c01e0) == 0)) {
					for (int i_120_ = 1; i_106_ - 1 > i_120_; i_120_++) {
						if ((is[i_114_ + i_106_][i_120_ + i_111_] & 0x12c01e3) != 0)
							break while_340_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_ + 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ + 1][i_111_] = 8;
					Class137.anIntArrayArray2203[i_114_ + 1][i_111_] = i_118_;
				}
			} while (false);
			while_341_: do {
				if (i_111_ > 0 && Class33.anIntArrayArray575[i_114_][i_111_ - 1] == 0
						&& (is[i_114_][i_111_ - 1] & 0x12c010e) == 0
						&& ((is[i_114_ + i_106_ - 1][i_111_ - 1] & 0x12c0183) == 0)) {
					for (int i_121_ = 1; i_106_ - 1 > i_121_; i_121_++) {
						if ((is[i_121_ + i_114_][i_111_ - 1] & 0x12c018f) != 0)
							break while_341_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_][i_111_ - 1] = 1;
					Class137.anIntArrayArray2203[i_114_][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_342_: do {
				if (i_111_ < 102 && Class33.anIntArrayArray575[i_114_][i_111_ + 1] == 0
						&& (is[i_114_][i_111_ + i_106_] & 0x12c0138) == 0
						&& ((is[i_106_ + i_114_ - 1][i_106_ + i_111_] & 0x12c01e0) == 0)) {
					for (int i_122_ = 1; i_106_ - 1 > i_122_; i_122_++) {
						if ((is[i_114_ + i_122_][i_106_ + i_111_] & 0x12c01f8) != 0)
							break while_342_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_][i_111_ + 1] = 4;
					Class137.anIntArrayArray2203[i_114_][i_111_ + 1] = i_118_;
				}
			} while (false);
			while_343_: do {
				if (i_114_ > 0 && i_111_ > 0 && Class33.anIntArrayArray575[i_114_ - 1][i_111_ - 1] == 0
						&& ((is[i_114_ - 1][i_111_ - 1 + (i_106_ - 1)] & 0x12c0138) == 0)
						&& (is[i_114_ - 1][i_111_ - 1] & 0x12c010e) == 0
						&& ((is[i_114_ - 1 - 1 + i_106_][i_111_ - 1] & 0x12c0183) == 0)) {
					for (int i_123_ = 1; i_106_ - 1 > i_123_; i_123_++) {
						if (((is[i_114_ - 1][i_111_ - 1 + i_123_] & 0x12c013e) != 0)
								|| (is[i_123_ + (i_114_ - 1)][i_111_ - 1] & 0x12c018f) != 0)
							break while_343_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_ - 1] = 3;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_344_: do {
				if (i_114_ < 102 && i_111_ > 0 && Class33.anIntArrayArray575[i_114_ + 1][i_111_ - 1] == 0
						&& (is[i_114_ + 1][i_111_ - 1] & 0x12c010e) == 0
						&& (is[i_114_ + i_106_][i_111_ - 1] & 0x12c0183) == 0
						&& (is[i_106_ + i_114_][i_106_ + (i_111_ - 2)] & 0x12c01e0) == 0) {
					for (int i_124_ = 1; i_124_ < i_106_ - 1; i_124_++) {
						if ((is[i_106_ + i_114_][i_124_ + (i_111_ - 1)] & 0x12c01e3) != 0
								|| (is[i_124_ + i_114_ + 1][i_111_ - 1] & 0x12c018f) != 0)
							break while_344_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_ + 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					Class33.anIntArrayArray575[i_114_ + 1][i_111_ - 1] = 9;
					i_115_ = i_115_ + 1 & 0xfff;
					Class137.anIntArrayArray2203[i_114_ + 1][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_345_: do {
				if (i_114_ > 0 && i_111_ < 102 && Class33.anIntArrayArray575[i_114_ - 1][i_111_ + 1] == 0
						&& (is[i_114_ - 1][i_111_ + 1] & 0x12c010e) == 0
						&& (is[i_114_ - 1][i_111_ + i_106_] & 0x12c0138) == 0
						&& (is[i_114_][i_111_ + i_106_] & 0x12c01e0) == 0) {
					for (int i_125_ = 1; i_106_ - 1 > i_125_; i_125_++) {
						if ((is[i_114_ - 1][i_125_ + (i_111_ + 1)] & 0x12c013e) != 0
								|| (is[i_125_ + (i_114_ - 1)][i_111_ + i_106_] & 0x12c01f8) != 0)
							break while_345_;
					}
					JunkTex.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_ + 1] = 6;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_ + 1] = i_118_;
				}
			} while (false);
			if (i_114_ < 102 && i_111_ < 102 && Class33.anIntArrayArray575[i_114_ + 1][i_111_ + 1] == 0
					&& (is[i_114_ + 1][i_106_ + i_111_] & 0x12c0138) == 0
					&& (is[i_106_ + i_114_][i_111_ + i_106_] & 0x12c01e0) == 0
					&& (is[i_114_ + i_106_][i_111_ + 1] & 0x12c0183) == 0) {
				for (int i_126_ = 1; i_126_ < i_106_ - 1; i_126_++) {
					if ((is[i_114_ - (-i_126_ - 1)][i_106_ + i_111_] & 0x12c01f8) != 0
							|| (is[i_106_ + i_114_][i_111_ + 1 + i_126_] & 0x12c01e3) != 0)
						continue while_346_;
				}
				JunkTex.anIntArray4691[i_115_] = i_114_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
				i_115_ = i_115_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_114_ + 1][i_111_ + 1] = 12;
				Class137.anIntArrayArray2203[i_114_ + 1][i_111_ + 1] = i_118_;
			}
		}
		Static2.anInt2911 = 0;
		if (!bool_117_) {
			if (bool) {
				int i_127_ = 1000;
				int i_128_ = 10;
				int i_129_ = 100;
				for (int i_130_ = i_110_ - i_128_; i_110_ + i_128_ >= i_130_; i_130_++) {
					for (int i_131_ = i - i_128_; i + i_128_ >= i_131_; i_131_++) {
						if (i_130_ >= 0 && i_131_ >= 0 && i_130_ < 104 && i_131_ < 104
								&& (Class137.anIntArrayArray2203[i_130_][i_131_] < 100)) {
							int i_132_ = 0;
							int i_133_ = 0;
							if (i_130_ < i_110_)
								i_133_ = -i_130_ + i_110_;
							else if (i_110_ + i_108_ - 1 < i_130_)
								i_133_ = 1 - i_110_ - (i_108_ - i_130_);
							if (i > i_131_)
								i_132_ = -i_131_ + i;
							else if (i_109_ + (i - 1) < i_131_)
								i_132_ = i_131_ + 1 - i_109_ - i;
							int i_134_ = i_132_ * i_132_ + i_133_ * i_133_;
							if (i_127_ > i_134_
									|| (i_127_ == i_134_ && i_129_ > (Class137.anIntArrayArray2203[i_130_][i_131_]))) {
								i_111_ = i_131_;
								i_127_ = i_134_;
								i_114_ = i_130_;
								i_129_ = (Class137.anIntArrayArray2203[i_130_][i_131_]);
							}
						}
					}
				}
				if (i_127_ == 1000) {
					boolean bool_135_ = false;
					return bool_135_;
				}
				if (i_114_ == i_102_ && i_111_ == i_100_) {
					boolean bool_136_ = false;
					return bool_136_;
				}
				Static2.anInt2911 = 1;
			} else
				return false;
		}
		i_115_ = 0;
		JunkTex.anIntArray4691[i_115_] = i_114_;
		Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_111_;
		int i_137_ = i_116_ = Class33.anIntArrayArray575[i_114_][i_111_];
		while (i_102_ != i_114_ || i_111_ != i_100_) {
			if (i_116_ != i_137_) {
				JunkTex.anIntArray4691[i_115_] = i_114_;
				i_116_ = i_137_;
				Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_111_;
			}
			if ((i_137_ & 0x2) == 0) {
				if ((i_137_ & 0x8) != 0)
					i_114_--;
			} else
				i_114_++;
			if ((i_137_ & 0x1) != 0)
				i_111_++;
			else if ((i_137_ & 0x4) != 0)
				i_111_--;
			i_137_ = Class33.anIntArrayArray575[i_114_][i_111_];
		}
		if (i_115_ > 0) {
			SceneGraphNode.method1782(-20179, i_115_, i_101_);
			boolean bool_138_ = true;
			return bool_138_;
		}
		if (i_101_ == 1) {
			boolean bool_139_ = false;
			return bool_139_;
		}
		boolean bool_140_ = true;
		return bool_140_;
	}
}
