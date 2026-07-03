package p039e5;

import android.media.AudioTrack;
import java.util.concurrent.atomic.AtomicBoolean;
import p060h5.AbstractC1793a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vn */
/* loaded from: classes.dex */
public abstract class AbstractC1374vn {

    /* renamed from: a */
    public static final AtomicBoolean f8208a = new AtomicBoolean(false);

    /* renamed from: b */
    public static volatile AudioTrack f8209b;

    /* renamed from: c */
    public static volatile Thread f8210c;

    /* renamed from: a */
    public static void m2372a() {
        f8208a.set(false);
        Thread thread = f8210c;
        if (thread != null) {
            thread.interrupt();
        }
        f8210c = null;
        AudioTrack audioTrack = f8209b;
        if (audioTrack != null) {
            try {
                audioTrack.pause();
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
            try {
                audioTrack.flush();
            } catch (Throwable th2) {
                AbstractC1793a0.m2985m(th2);
            }
            try {
                audioTrack.stop();
            } catch (Throwable th3) {
                AbstractC1793a0.m2985m(th3);
            }
            try {
                audioTrack.release();
            } catch (Throwable th4) {
                AbstractC1793a0.m2985m(th4);
            }
        }
        f8209b = null;
    }
}
