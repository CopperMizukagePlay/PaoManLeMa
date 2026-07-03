package p039e5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import p060h5.AbstractC1793a0;
import p077k.C2184c0;
import p158u5.AbstractC3367j;
import p170w1.AbstractC3681h0;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.un */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1343un implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f7979e;

    public /* synthetic */ RunnableC1343un(int i7) {
        this.f7979e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.f7979e) {
            case 0:
                Process.setThreadPriority(-16);
                int minBufferSize = AudioTrack.getMinBufferSize(8000, 4, 2);
                if (minBufferSize < 4000) {
                    minBufferSize = 4000;
                }
                byte[] bArr = new byte[minBufferSize];
                AudioTrack build = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(8000).setChannelMask(4).setEncoding(2).build()).setBufferSizeInBytes(minBufferSize).setTransferMode(1).build();
                AbstractC3367j.m5099d(build, "build(...)");
                AbstractC1374vn.f8209b = build;
                try {
                    build.setVolume(0.0f);
                    build.play();
                    while (AbstractC1374vn.f8208a.get() && !Thread.currentThread().isInterrupted()) {
                        if (build.write(bArr, 0, minBufferSize) < 0) {
                            Thread.sleep(100L);
                        }
                    }
                    try {
                        build.pause();
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                    try {
                        build.flush();
                    } catch (Throwable th2) {
                        AbstractC1793a0.m2985m(th2);
                    }
                    try {
                        build.stop();
                    } catch (Throwable th3) {
                        AbstractC1793a0.m2985m(th3);
                    }
                    try {
                        build.release();
                    } catch (Throwable th4) {
                        AbstractC1793a0.m2985m(th4);
                    }
                    AbstractC1374vn.f8209b = null;
                    return;
                } catch (Throwable th5) {
                    try {
                        build.pause();
                    } catch (Throwable th6) {
                        AbstractC1793a0.m2985m(th6);
                    }
                    try {
                        build.flush();
                    } catch (Throwable th7) {
                        AbstractC1793a0.m2985m(th7);
                    }
                    try {
                        build.stop();
                    } catch (Throwable th8) {
                        AbstractC1793a0.m2985m(th8);
                    }
                    try {
                        build.release();
                    } catch (Throwable th9) {
                        AbstractC1793a0.m2985m(th9);
                    }
                    AbstractC1374vn.f8209b = null;
                    throw th5;
                }
            default:
                C2184c0 c2184c0 = C3728t.f17699O0;
                synchronized (c2184c0) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = c2184c0.f12628a;
                            int i8 = c2184c0.f12629b;
                            while (i7 < i8) {
                                C3728t c3728t = (C3728t) objArr[i7];
                                boolean showLayoutBounds = c3728t.getShowLayoutBounds();
                                Class cls = C3728t.f17696L0;
                                c3728t.setShowLayoutBounds(AbstractC3681h0.m5692s());
                                if (showLayoutBounds != c3728t.getShowLayoutBounds()) {
                                    C3728t.m5724o(c3728t.getRoot());
                                }
                                i7++;
                            }
                        } else {
                            Object[] objArr2 = c2184c0.f12628a;
                            int i9 = c2184c0.f12629b;
                            while (i7 < i9) {
                                C3728t.m5724o(((C3728t) objArr2[i7]).getRoot());
                                i7++;
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return;
        }
    }
}
