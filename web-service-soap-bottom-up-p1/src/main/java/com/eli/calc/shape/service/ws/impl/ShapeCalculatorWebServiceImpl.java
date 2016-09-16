package com.eli.calc.shape.service.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.ShapeName;
import com.eli.calc.shape.service.ShapeCalculatorService;
import com.eli.calc.shape.service.ws.ShapeCalculatorWebService;
import com.eli.calc.shape.service.ws.types.CalculatedResultsResponse;
import com.eli.calc.shape.service.ws.types.PendingRequestsResponse;
import com.eli.calc.shape.service.ws.types.SuccessOrErrorResponse;

@WebService
public class ShapeCalculatorWebServiceImpl implements ShapeCalculatorWebService {


	private static final Logger logger = LoggerFactory.getLogger(ShapeCalculatorWebServiceImpl.class);

	@Autowired
	private ShapeCalculatorService calculator;
	
	public ShapeCalculatorWebServiceImpl() {
		logger.debug("\n\n\nConstructor\n\n\n");
	}

	@Override
	public SuccessOrErrorResponse deleteAllPendingRequests() {

		logger.debug("\n\n\nExecuting operation deleteAllPendingRequests...\n\n\n");

		return null;
	}

	@Override
	public SuccessOrErrorResponse deleteAllResults() {

		logger.debug("\n\n\nExecuting operation deleteAllResults...\n\n\n");

		return null;
	}

	@Override
	public SuccessOrErrorResponse queueCalculationRequest(
			ShapeName shapeName, 
			CalcType calcType, 
			double dimension) {

		logger.debug("\n\n\nExecuting operation queueCalculationRequest:"
				+shapeName+","+calcType+","+dimension+" ...\n\n\n");

		calculator.queueCalculationRequest(shapeName,calcType,dimension);
	
		return null;
	}

	@Override
	public PendingRequestsResponse getAllPendingRequests() {

		logger.debug("\n\n\nExecuting operation getAllPendingRequests...\n\n\n");

		return null;
	}

	@Override
	public CalculatedResultsResponse getAllCalculatedResults() {

		logger.debug("\n\n\nExecuting operation getAllCalculatedResults...\n\n\n");

		return null;
	}

	@Override
	public SuccessOrErrorResponse runAllPendingRequestsStopOnError() {

		logger.debug("\n\n\nExecuting operation runAllPendingRequestsStopOnError...\n\n\n");

		return null;
	}

	@Override
	public SuccessOrErrorResponse runAllPendingRequestsNoStopOnError() {

		logger.debug("\n\n\nExecuting operation runAllPendingRequestsNoStopOnError ...\n\n\n");

		return null;
	}

}
