package org.wecancodeit.gpureview;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="Bad Request, GPU not found!")
public class GpuNotFoundException extends Exception {
}
