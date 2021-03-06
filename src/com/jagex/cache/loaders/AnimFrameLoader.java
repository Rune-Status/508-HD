/* Class14_Sub2_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.cache.anim.AnimFrame;
import com.jagex.cache.anim.AnimFrameBase;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.Cacheable;
import com.jagex.link.Deque;
import com.jagex.util.Util;

public class AnimFrameLoader extends Cacheable {
	public AnimFrame[] frames;

	public AnimFrameLoader(FileSystem fileSystem, FileSystem fileSystem_9_, int i, boolean bool) {
		Deque deque = new Deque();
		int i_10_ = fileSystem.method177(i);
		frames = new AnimFrame[i_10_];
		int[] is = fileSystem.method176(i);
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			AnimFrameBase animframebase = null;
			byte[] is_12_ = fileSystem.method163(is[i_11_], i);
			int i_13_ = is_12_[1] & 0xff | is_12_[0] << 8 & 0xff00;
			for (AnimFrameBase animframebase_14_ = (AnimFrameBase) deque.getFront(); animframebase_14_ != null; animframebase_14_ = (AnimFrameBase) deque.getNext()) {
				if (animframebase_14_.anInt2805 == i_13_) {
					animframebase = animframebase_14_;
					break;
				}
			}
			if (animframebase == null) {
				byte[] is_15_;
				if (!bool)
					is_15_ = fileSystem_9_.method157(0, i_13_);
				else
					is_15_ = fileSystem_9_.method157(i_13_, 0);
				animframebase = new AnimFrameBase(i_13_, is_15_);
				deque.pushBack(animframebase);
			}
			frames[is[i_11_]] = new AnimFrame(is_12_, animframebase);
		}
	}

	public boolean method338(int i_0_) {
		return frames[i_0_].opaque;
	}

	public static AnimFrameLoader method933(FileSystem fileSystem, FileSystem fileSystem_19_, int i, byte i_20l_, boolean bool) {
		boolean bool_21_ = false;
		int[] is = fileSystem_19_.method176(i);
		bool_21_ = true;
		is = fileSystem_19_.method176(i);
		for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
			byte[] is_23_ = fileSystem_19_.method157(is[i_22_], i);
			if (is_23_ == null)
				bool_21_ = false;
			else {
				int i_24_ = is_23_[1] & 0xff | (is_23_[0] & 0xff) << 8;
				byte[] is_25_;
				if (bool)
					is_25_ = fileSystem.method157(i_24_, 0);
				else
					is_25_ = fileSystem.method157(0, i_24_);
				if (is_25_ == null)
					bool_21_ = false;
			}
		}
		if (!bool_21_) {
			AnimFrameLoader class14_sub2_sub15 = null;
			return class14_sub2_sub15;
		}
		AnimFrameLoader class14_sub2_sub15;
		try {
			class14_sub2_sub15 = new AnimFrameLoader(fileSystem_19_, fileSystem, i, bool);
		} catch (Exception exception) {
			class14_sub2_sub15 = null;
			return class14_sub2_sub15;
		} catch (Throwable throwable) {
			throw Util.error(throwable,
					new StringBuilder("ve.C(").append(fileSystem != null ? "{...}" : "null").append(',')
							.append(fileSystem_19_ != null ? "{...}" : "null").append(',').append(i).append(',').append(',').append(bool).append(')').toString());
		}
		return class14_sub2_sub15;
	}
}
