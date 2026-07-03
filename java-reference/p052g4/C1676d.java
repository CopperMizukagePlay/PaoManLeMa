package p052g4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.util.Log;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.paoman.lema.R;
import java.io.IOException;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p109o1.InterfaceC2796a;
import p122q.C2899d1;
import p122q.C2929n1;
import p140s2.C3107q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.d */
/* loaded from: classes.dex */
public final class C1676d implements InterfaceC2796a {

    /* renamed from: e */
    public boolean f10453e;

    /* renamed from: f */
    public final Object f10454f;

    public /* synthetic */ C1676d(Object obj, boolean z7) {
        this.f10454f = obj;
        this.f10453e = z7;
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: N */
    public long mo2743N(int i7, long j6, long j7) {
        if (this.f10453e) {
            C2929n1 c2929n1 = (C2929n1) this.f10454f;
            if (!c2929n1.f15229a.mo114c()) {
                return c2929n1.m4594g(c2929n1.m4590c(c2929n1.f15229a.mo116e(c2929n1.m4590c(c2929n1.m4593f(j7)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    /* renamed from: a */
    public void m2744a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new Object());
        mediaPlayer.setOnErrorListener(new Object());
        try {
            AssetFileDescriptor openRawResourceFd = ((Context) this.f10454f).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException e7) {
            Log.w("d", e7);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p109o1.InterfaceC2796a
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo2745n(long j6, long j7, InterfaceC2313c interfaceC2313c) {
        C2899d1 c2899d1;
        int i7;
        long j8;
        if (interfaceC2313c instanceof C2899d1) {
            c2899d1 = (C2899d1) interfaceC2313c;
            int i8 = c2899d1.f15122k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2899d1.f15122k = i8 - Integer.MIN_VALUE;
                Object obj = c2899d1.f15120i;
                i7 = c2899d1.f15122k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        j7 = c2899d1.f15119h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (this.f10453e) {
                        C2929n1 c2929n1 = (C2929n1) this.f10454f;
                        c2899d1.f15119h = j7;
                        c2899d1.f15122k = 1;
                        obj = c2929n1.m4589b(j7, c2899d1);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        j8 = 0;
                        return new C3107q(j8);
                    }
                }
                j8 = C3107q.m4803d(j7, ((C3107q) obj).f15711a);
                return new C3107q(j8);
            }
        }
        c2899d1 = new C2899d1(this, (AbstractC2583c) interfaceC2313c);
        Object obj2 = c2899d1.f15120i;
        i7 = c2899d1.f15122k;
        if (i7 == 0) {
        }
        j8 = C3107q.m4803d(j7, ((C3107q) obj2).f15711a);
        return new C3107q(j8);
    }

    public C1676d() {
        this(null, false);
    }

    public C1676d(CaptureActivity captureActivity) {
        this.f10453e = true;
        captureActivity.setVolumeControlStream(3);
        this.f10454f = captureActivity.getApplicationContext();
    }
}
