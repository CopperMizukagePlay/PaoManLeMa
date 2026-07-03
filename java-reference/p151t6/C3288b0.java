package p151t6;

import java.io.IOException;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.b0 */
/* loaded from: classes.dex */
public final class C3288b0 extends IOException {

    /* renamed from: e */
    public final int f16141e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3288b0(int i7) {
        super("stream was reset: ".concat(r0));
        String str;
        AbstractC2487d.m4055s("errorCode", i7);
        switch (i7) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case AbstractC3122c.f15761f /* 5 */:
                str = "SETTINGS_TIMEOUT";
                break;
            case AbstractC3122c.f15759d /* 6 */:
                str = "STREAM_CLOSED";
                break;
            case 7:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case AbstractC3122c.f15758c /* 9 */:
                str = "CANCEL";
                break;
            case AbstractC3122c.f15760e /* 10 */:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.f16141e = i7;
    }
}
